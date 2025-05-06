package com.java.Exception;

public class FileException {

    public void readFileException(String fileName) throws FileProcessingException {
        if (!fileName.equals("hello")) {
            throw new FileProcessingException("File is not processed");
        } else {
            System.out.println("File processed successfully.");
        }
    }

    public static void main(String[] args) throws FileProcessingException {
        FileException fileException = new FileException();
        fileException.readFileException("sdfgsda");
    }
}
