package com.velware.photo.manager;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifSubIFDDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by uriel on 12/28/2014.
 */
public class PhotoManagerMain {

    public static void main(String args[]){

//        String inputDirectoryName = "E:\\backup-camera-2015-06-07";
//        String outputDirectoryName = "E:\\Google Drive\\Pictures\\shared";
//        Path dir = Paths.get(inputDirectoryName);
//
//        try {
//            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir,filter)) {
//                for (Path path : directoryStream) {
//
//                    Metadata metadata = null;
//                    String fileToCopy = null;
//                    try {
//                        metadata = ImageMetadataReader.readMetadata(path.toFile());
//                        ExifSubIFDDirectory directory
//                                = metadata.getDirectory(ExifSubIFDDirectory.class);
//                        Date date
//                                = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
//                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                        try {
//                            if (!Files.exists(Paths.get(outputDirectoryName +"\\"+ sdf.format(date)), LinkOption.NOFOLLOW_LINKS)) {
//                                Files.createDirectory(Paths.get(outputDirectoryName +"\\"+ sdf.format(date)));
//                            }
//                            fileToCopy = outputDirectoryName+"\\"+sdf.format(date)+"\\"+path.getFileName().toString();
//                        }catch (Exception e){
//                            if (!Files.exists(Paths.get(outputDirectoryName + "\\unsorted"), LinkOption.NOFOLLOW_LINKS)) {
//                                Files.createDirectory(Paths.get(outputDirectoryName + "\\unsorted"));
//                            }
//                            fileToCopy = outputDirectoryName+"\\unsorted\\"+path.getFileName().toString();
//                        }
//
//                        if (!Files.exists(Paths.get(fileToCopy))) {
//                            System.out.println("Copying... [" + path.getFileName().toString() + "] to [" + fileToCopy + "]");
//                            Files.copy(path, Paths.get(fileToCopy));
//                        }
//                    } catch (ImageProcessingException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }



    public static DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
        public boolean accept(Path file) throws IOException {
            return file.getFileName().toString().toLowerCase().endsWith(".jpg");
        }
    };

}
