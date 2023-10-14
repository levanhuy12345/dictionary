/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hieu
 */
public class Dictionary {
    private String wordEnglish;
    private String wordVietnamese;

    public Dictionary() {
    }

    public Dictionary(String wordEnglish, String wordVietnamese) {
        this.wordEnglish = wordEnglish;
        this.wordVietnamese = wordVietnamese;
    }

    public String getWordEnglish() {
        return wordEnglish;
    }

    public void setWordEnglish(String wordEnglish) {
        this.wordEnglish = wordEnglish;
    }

    public String getWordVietnamese() {
        return wordVietnamese;
    }

    public void setWordVietnamese(String wordVietnamese) {
        this.wordVietnamese = wordVietnamese;
    }

    @Override
    public String toString() {
        return wordEnglish + " | " + wordVietnamese;
    }
    
    
}

