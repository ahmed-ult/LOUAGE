package com.example.ahmed_inf.louage;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Ahmed-INF on 22/04/2016.
 */
public class BackgroundTask extends AsyncTask<String , Void ,String> {
    Context ctx ;
    BackgroundTask ( Context ctx){

        this.ctx= ctx;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
    }
    @Override
    protected String doInBackground (String...params)
    {  String reg_url = "http://192.168.1.67/webapp/register.php";
        String log_url = "http://192.168.1.67/webapp/login.php";

        // passer the  fromation in  the database
        String methode = params[0];
        if(methode.equals("register")){

            String user_name = params[1];
            String user_pass = params[2];
            try{
                URL url=new URL(reg_url);

                try{
                    HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    OutputStream os = httpURLConnection.getOutputStream();




                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                    String data = URLEncoder.encode("user_name", "UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+
                            URLEncoder.encode("user_pass","UTF-8")+"="+URLEncoder.encode(user_pass,"UTF-8");
                    bufferedWriter.write(data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    os.close();
                    InputStream IS =  httpURLConnection.getInputStream();
                    IS.close();
                    return "Registration success...";
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
            catch (MalformedURLException e){e.printStackTrace();}

        }
        return null;
    }


    protected void OnProgressUpdate(Void...values){
        super.onProgressUpdate(values);
        //return null;
    }

    @Override
    protected void onPostExecute(String  result){

        Toast.makeText(ctx,result, Toast.LENGTH_LONG).show();
    }

}

