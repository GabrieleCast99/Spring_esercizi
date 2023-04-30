package exercise.MongoDB.Config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.config.MongoClientParser;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "gabrielecastiglione";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString= new ConnectionString("mongodb+srv://gabrielecastiglione:<Gabriele1>@gabrielecastiglione.2ktus61.mongodb.net/gabrielecastiglione?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
            return MongoClients.create(mongoClientSettings);
    }


    @Override
    protected Collection<String> getMappingBasePackages(){
        return Collections.singleton("co.gabrielecastiglione");
    }
}
