package com.example.worldapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HobyScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoby_screen);

        Button regButton = findViewById(R.id.registerButton);




        // Take Hobbies
        CheckBox soccer = findViewById(R.id.soccer);
        CheckBox basketBall = findViewById(R.id.Basketball);
        CheckBox hiking = findViewById(R.id.Hiking);
        CheckBox fitness = findViewById(R.id.Fitness);
        CheckBox walking = findViewById(R.id.Walking);
        CheckBox swimming = findViewById(R.id.Swimming);
        CheckBox boxing = findViewById(R.id.Boxing);
        CheckBox wrestling = findViewById(R.id.Wrestling);
        CheckBox martialArts = findViewById(R.id.MartialArts);
        CheckBox iOSDev = findViewById(R.id.iOSDev);
        CheckBox androidDev = findViewById(R.id.AndroidDev);
        CheckBox webDev = findViewById(R.id.WebDev);
        CheckBox AI = findViewById(R.id.AI);
        CheckBox gameDev = findViewById(R.id.GameDev);
        CheckBox devOps = findViewById(R.id.DevOps);
        CheckBox softwareTesting = findViewById(R.id.SoftwareTesting);
        CheckBox embeddedSystems = findViewById(R.id.EmbeddedSystems);
        CheckBox blockchainDevelopment = findViewById(R.id.BlockchainDevelopment);
        CheckBox cyberSec = findViewById(R.id.Cybersecurity);
        CheckBox dataScience = findViewById(R.id.DataScience);
        CheckBox roboticsSoftwareDevelopment = findViewById(R.id.RoboticsSoftwareDevelopment);
        CheckBox databaseManagement = findViewById(R.id.DatabaseManagement);
        CheckBox pop = findViewById(R.id.Pop);
        CheckBox rock = findViewById(R.id.Rock);
        CheckBox metal = findViewById(R.id.Metal);
        CheckBox hipHop = findViewById(R.id.HipHop);
        CheckBox Jazz = findViewById(R.id.Jazz);
        CheckBox electronic = findViewById(R.id.Electronic);
        CheckBox Valorant = findViewById(R.id.Valorant);
        CheckBox fortnite = findViewById(R.id.Fortnite);
        CheckBox fifa = findViewById(R.id.FIFA);
        CheckBox sexualitiy = findViewById(R.id.Sexualitiy);
        CheckBox politics = findViewById(R.id.politics);
        CheckBox news = findViewById(R.id.news);
        CheckBox religion = findViewById(R.id.religion);
        CheckBox pets = findViewById(R.id.pets);
        CheckBox relationships = findViewById(R.id.relationships);
        CheckBox Food = findViewById(R.id.Food);
        CheckBox Design = findViewById(R.id.Design);
        CheckBox travel = findViewById(R.id.travel);


        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hobbies Control
                ArrayList<String> selectedHobbies = new ArrayList<>();
                if (soccer.isChecked()){
                    selectedHobbies.add("Soccer");
                }
                if (basketBall.isChecked()){
                    selectedHobbies.add("Basketball");
                }
                if (hiking.isChecked()){
                    selectedHobbies.add("Hiking");
                }
                if (fitness.isChecked()){
                    selectedHobbies.add("Fitness");
                }
                if (walking.isChecked()){
                    selectedHobbies.add("Walking");
                }
                if (swimming.isChecked()){
                    selectedHobbies.add("Swimming");
                }
                if (swimming.isChecked()){
                    selectedHobbies.add("Swimming");
                }
                if (boxing.isChecked()){
                    selectedHobbies.add("Boxing");
                }
                if (wrestling.isChecked()){
                    selectedHobbies.add("Wrestling");
                }
                if (martialArts.isChecked()){
                    selectedHobbies.add("Martial Arts");
                }
                if (iOSDev.isChecked()){
                    selectedHobbies.add("iOS Developer");
                }
                if (androidDev.isChecked()){
                    selectedHobbies.add("Android Developer");
                }
                if (webDev.isChecked()){
                    selectedHobbies.add("WEB Developer");
                }
                if (AI.isChecked()){
                    selectedHobbies.add("Artificial Intelligence");
                }
                if (gameDev.isChecked()){
                    selectedHobbies.add("Game Developer");
                }
                if (devOps.isChecked()){
                    selectedHobbies.add("DevOps");
                }
                if (softwareTesting.isChecked()){
                    selectedHobbies.add("Software Testing");
                }
                if (embeddedSystems.isChecked()){
                    selectedHobbies.add("Embeded Systems");
                }
                if (blockchainDevelopment.isChecked()){
                    selectedHobbies.add("Blockchain Development");
                }
                if (cyberSec.isChecked()){
                    selectedHobbies.add(" Cyber Security");
                }
                if (dataScience.isChecked()){
                    selectedHobbies.add(" Data Science");
                }
                if (roboticsSoftwareDevelopment.isChecked()){
                    selectedHobbies.add("Robotic SSoftware Development");
                }
                if (databaseManagement.isChecked()){
                    selectedHobbies.add("Database Management");
                }
                if (pop.isChecked()){
                    selectedHobbies.add("Pop");
                }
                if (rock.isChecked()){
                    selectedHobbies.add("Rock");
                }
                if (metal.isChecked()){
                    selectedHobbies.add("Metal");
                }
                if (hipHop.isChecked()){
                    selectedHobbies.add("Hip-Hop");
                }
                if (Jazz.isChecked()){
                    selectedHobbies.add("Jazz");
                }
                if (electronic.isChecked()){
                    selectedHobbies.add("Electronic");
                }
                if (Valorant.isChecked()){
                    selectedHobbies.add("Valorant");
                }
                if (fortnite.isChecked()){
                    selectedHobbies.add("Fortnite");
                }
                if (fifa.isChecked()){
                    selectedHobbies.add("FIFA");
                }
                if (sexualitiy.isChecked()){
                    selectedHobbies.add("Sexualitiy");
                }
                if (politics.isChecked()){
                    selectedHobbies.add("Politics");
                }
                if (news.isChecked()){
                    selectedHobbies.add("News");
                }
                if (religion.isChecked()){
                    selectedHobbies.add("Religion");
                }
                if (pets.isChecked()){
                    selectedHobbies.add("Pets");
                }
                if (relationships.isChecked()){
                    selectedHobbies.add("Relationships");
                }
                if (Food.isChecked()){
                    selectedHobbies.add("Food");
                }
                if (Design.isChecked()){
                    selectedHobbies.add("Design");
                }
                if (travel.isChecked()){
                    selectedHobbies.add("Travel");
                }



                //Pull  Data
                String username = getIntent().getStringExtra("username");
                String password = getIntent().getStringExtra("password");
                String email = getIntent().getStringExtra("email");

                //user add DB
                DataBaseHelper dbHelper = new DataBaseHelper(HobyScreen.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues userValues = new ContentValues();
                userValues.put(DataBaseHelper.COLUMN_USER_NAME, username);
                userValues.put(DataBaseHelper.COLUMN_PASSWORD,password);
                userValues.put(DataBaseHelper.COLUMN_EMAIL,email);
                long userId = db.insert((DataBaseHelper.TABLE_USER ),null,userValues);


                //checked add DB

                for (String hobbie : selectedHobbies) {
                    ContentValues hobbieValues = new ContentValues();
                    hobbieValues.put(DataBaseHelper.COLUMN_HOBBIES_ID, userId);
                    hobbieValues.put(DataBaseHelper.COLUMN_HOBBIES, hobbie);
                    db.insert(DataBaseHelper.COLUMN_HOBBIES, null, hobbieValues);
                }

                db.close();
                Intent intent = new Intent(HobyScreen.this,MainActivity.class);
                startActivity(intent);







            }



        });


    }
}