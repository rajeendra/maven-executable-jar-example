package mongo_group_id_one;

/**
 * Hello world!
 *
 */


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoDatabase;


import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // mongodb://rajeendra:admin@cluster0-shard-00-00-wx4nj.mongodb.net:27017,cluster0-shard-00-01-wx4nj.mongodb.net:27017,cluster0-shard-00-02-wx4nj.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin

        MongoClientURI uri = new MongoClientURI(
                "mongodb://rajeendra:admin@cluster0-shard-00-00-wx4nj.mongodb.net:27017,cluster0-shard-00-01-wx4nj.mongodb.net:27017,cluster0-shard-00-02-wx4nj.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");
        System.out.println(database.getName());
    }
}
