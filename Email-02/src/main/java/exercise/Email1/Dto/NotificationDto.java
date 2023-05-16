package exercise.Email1.Dto;

import lombok.Data;

@Data
public class NotificationDto {

    private String studentId;
    private String title;
    private String text;


    public NotificationDto() {
        this.studentId = studentId;
        this.title = title;
        this.text = text;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "NotificationDto{" +
                "studentId='" + studentId + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }



}
