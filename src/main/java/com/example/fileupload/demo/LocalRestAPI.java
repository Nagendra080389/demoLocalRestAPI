package com.example.fileupload.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LocalRestAPI {

    @PostMapping(value = "/multiple", consumes = { "multipart/form-data" })
    public String singleFileUpload(@RequestParam("files") MultipartFile[] files) {

        List<String> strings = new ArrayList<>();
        for (MultipartFile file : files) {
            System.out.println(file.getOriginalFilename());
            strings.add(file.getOriginalFilename());
        }
        return "Files received are : -> "+ String.join(",", strings);

    }
}
