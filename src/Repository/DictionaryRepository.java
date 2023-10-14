/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DataAccess.DictionaryDao;
import java.util.HashMap;
import Model.Dictionary;
/**
 *
 * @author hieu
 */
public class DictionaryRepository implements IDictionaryRepository {

    @Override
    public void addWord(HashMap<String, Dictionary> dictionarys) {
        DictionaryDao.Instance().addWork(dictionarys);
    }

    @Override
    public void removeWord(HashMap<String, Dictionary> dictionarys) {
        boolean b = DictionaryDao.Instance().deleteWord(dictionarys);
        if (b == true)
            System.out.println("Successful");
        else
            System.out.println("Failed");
    }

    @Override
    public void translate(HashMap<String, Dictionary> dictionarys) {
        String s = DictionaryDao.Instance().translate(dictionarys);
        if (s != null) {
            System.out.println("Vietnamese: " + s);
            System.out.println("Successful");
        }
        else
            System.out.println("Failed");
    }
 
}

