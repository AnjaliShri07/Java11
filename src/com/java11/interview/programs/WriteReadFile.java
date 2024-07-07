package com.java11.interview.programs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteReadFile {
    public static void main(String[] args) {
        try {
            Path tempFilePath = Files.writeString(
                    Path.of(File.createTempFile("tempFile", ".tmp").toURI()),
                    "Welcome to TutorialsPoint",
                    Charset.defaultCharset(), StandardOpenOption.WRITE);

            String fileContent = Files.readString(tempFilePath);

            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
