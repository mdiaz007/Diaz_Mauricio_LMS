/*
	Mauricio Diaz
	CEN3024C
	July 13, 2024
	Software Development 1

	Book Class: This class holds all the necessary setters and getters for a book object.
*/

package com.mauricio.librarymanagementsystem;

public class Book { // Book class for setting up Book objects.

    // Declaring book variables.
    private int Id;
    private String Title;
    private String Author;
    private int ReleaseYear;
    private String Barcode;
    private String Status;
    private String DueDate;

    // Constructor for calling resetBook right as the book object is created.
    public Book(){
        resetBook();
    }

    // Initializing book variables.
    public void resetBook(){
        setId(0);
        setTitle(null);
        setAuthor(null);
        setReleaseYear(0);
        setBarcode(null);
        setStatus("Checked-In");
        setDueDate(null);
    }

    // Setters for Book Object (Holds information for book).
    public void setId(int Id){
        this.Id = Id;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setReleaseYear(int ReleaseYear){
        this.ReleaseYear = ReleaseYear;
    }
    public void setBarcode(String Barcode){
        this.Barcode = Barcode;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }
    public void setDueDate(String DueDate){
        this.DueDate = DueDate;
    }

    // Getters for Book Object (Holds information for book).
    public int getId(){
        return this.Id;
    }
    public String getTitle(){
        return this.Title;
    }
    public String getAuthor(){
        return this.Author;
    }
    public int getReleaseYear(){
        return this.ReleaseYear;
    }
    public String getBarcode(){
        return this.Barcode;
    }
    public String getStatus(){
        return this.Status;
    }
    public String getDueDate(){
        return this.DueDate;
    }

}