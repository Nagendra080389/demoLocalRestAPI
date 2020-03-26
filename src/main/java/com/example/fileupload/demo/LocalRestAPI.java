package com.example.fileupload.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Path;

@RestController
public class LocalRestAPI {

    @PostMapping(value = "/multiple", consumes = { "multipart/form-data" })
    public void singleFileUpload(@RequestParam("files") MultipartFile[] files, RedirectAttributes redirectAttributes) {

        for (MultipartFile file : files) {
            System.out.println(file.getOriginalFilename());
        }

    }
}
