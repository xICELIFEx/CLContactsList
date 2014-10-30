package com.example.icelife.clcontactslist.Database;

import android.media.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by ICELIFE on 29.10.2014.
 */
public class CLContactModel {
    private Integer mId;
    private String mFirstName;
    private String mLastName;
    private String mPhoneNumber;
//    private Byte[] mImage;

    public Integer getID() {
        return this.mId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public void setmLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.mPhoneNumber = phoneNumber;
    }

//    public Byte[] getImageByte() {
//        return this.mImage;
//    }
//
//    public void setImageByte(Byte[] image) {
//        this.mImage = image;
//    }
//
//    File image = new File(path);
//    FileInputStream fis = new FileInputStream ( image );
//
//    String sql="insert into imgtst (username,image) values (?, ?)";
//    pst=con.prepareStatement(sql);
//
//    pst.setString(1, user);
//    pst.setBinaryStream (2, fis, (int) file.length() );
//    When you retrieve it back you can similarly get an InputStream from the ResultSet:
//
//    InputStream imgStream = resultSet.getBinaryStream(2);
//
//    public Image getImage() {
//        return null;
//    }
//
//    public void setImage(Image image) {
//        byte[] imageInByte;
//        BufferedImage originalImage = ImageIO.read(new File(
//                "c:/darksouls.jpg"));
//
//        // convert BufferedImage to byte array
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(originalImage, "jpg", baos);
//        baos.flush();
//        imageInByte = baos.toByteArray();
//        baos.close();
//    }

    public CLContactModel() {
        this("", "", "");
    }

    public CLContactModel(String firstName) {
        this(firstName, "", "");
    }

    public CLContactModel(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public CLContactModel(String firstName, String lastName, String phoneNumber) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mPhoneNumber = phoneNumber;
    }
}
