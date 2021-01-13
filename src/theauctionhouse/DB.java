package theauctionhouse;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;


public class DB {


    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;
    Gson gson = new Gson();

    public DB() {
        // Disable Mongo Logs

        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");// removes extra warnings
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize database
        String connectionString = "mongodb+srv://Prince:wasdWASD@cluster0.19key.mongodb.net/TheAuctionHouse?retryWrites=true&w=majority";
        mongoClient = new MongoClient(new MongoClientURI(connectionString));

        database = mongoClient.getDatabase("TheAuctionHouse");
//     for every function:    collection = database.getCollection("USER");  Collection name
    }

    public void insertSeller(Seller s) {
        collection = database.getCollection("Seller");

        collection.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Seller inserted");
    }

}
