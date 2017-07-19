package com.assist.bookingjava.images;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by prelipcean on 19.07.2017.
 */

@RestController
public class ResourceController {

    private static String USER_UPLOADED_FOLDER = "./src/main/resources/images/";

    @RequestMapping(value = "/image/user/{id}", method = RequestMethod.GET)
    public void getUserImage(@PathVariable("id") String id, HttpServletResponse response) {
        try {
            Path path = Paths.get(USER_UPLOADED_FOLDER + id + "");
            InputStream in = new FileInputStream(path.toString());
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            IOUtils.copy(in, response.getOutputStream());
        } catch (IOException ex1) {

        }

    }
}
