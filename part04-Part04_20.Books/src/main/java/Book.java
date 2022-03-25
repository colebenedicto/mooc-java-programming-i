/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Book {
    private String title;
    private int numbersOfPages;
    private int yearPublished;
    
    public Book(String title, int pages, int year) {
        this.title = title;
        this.numbersOfPages = pages;
        this.yearPublished = year;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.numbersOfPages;
    }
    
    public int getYear() {
        return this.yearPublished;
    }
    
    
    @Override
    public String toString() {
        return this.title + ", " + this.numbersOfPages + " pages, " + this.yearPublished;
    }
}
