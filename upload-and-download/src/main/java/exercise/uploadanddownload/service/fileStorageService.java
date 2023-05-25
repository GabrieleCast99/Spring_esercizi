package exercise.uploadanddownload.service;

import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;


@Service
public class fileStorageService {

    @Value("${fileRepositoryFolder}")
    private String fileRepositoryFolder;

    @SneakyThrows
    public String upload(MultipartFile file){
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        String newFileName = UUID.randomUUID().toString() + "." + extension;
        String completeFileName= newFileName+"."+extension;
        File finalFolder= new File(fileRepositoryFolder);
        if(!finalFolder.exists()) throw new IOException("final folder not exist");
        if(!finalFolder.isDirectory()) throw new IOException("not directory");

        File finalDestination = new File(fileRepositoryFolder+ "\\"+ newFileName+"."+extension);
        if(finalDestination.exists()) throw new IOException("file conflict");

        file.transferTo(finalDestination);
        return completeFileName;

    }

    public byte[] download(String fileName) throws IOException {
        File fileFromRepository = new File(fileRepositoryFolder+"\\"+ fileName);
        if(!fileFromRepository.exists()) throw new IOException("not exist");
        return IOUtils.toByteArray(new FileInputStream(fileFromRepository));
    }
}
