package com.example.docinfoservice.Model;

import com.google.firebase.database.DatabaseReference;

public class MyModel_User {
    public String url, userid;

    public String getUserid()
    {
        return userid;
    }
    public void setUserid(String userid)
    {
        this.userid = userid;
    }
    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }
}

//    String url = uri.toString();
//    //String userid = FirebaseAuth.getInstance().getUid();
//
//    DatabaseReference reference= database.getReference();
////                                Map<String,Object> usermap = new HashMap<>();
////                                usermap.put("url",url);
////                                usermap.put("userid",userid);
//                                reference.child(filename1).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {