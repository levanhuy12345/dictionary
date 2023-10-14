/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.HashMap;
import Model.Dictionary;
/**
 *
 * @author hieu
 */
public interface IDictionaryRepository {
    void addWord(HashMap<String, Dictionary> dictionarys);
    void removeWord(HashMap<String, Dictionary> dictionarys);
    void translate(HashMap<String, Dictionary> dictionarys);
}
