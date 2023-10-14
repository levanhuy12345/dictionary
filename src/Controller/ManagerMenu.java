package controller;

import java.util.HashMap;
import Model.Dictionary;
import Repository.DictionaryRepository;
import Repository.IDictionaryRepository;
import View.Menu;

/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String> {
    private IDictionaryRepository dictionaryRepository;
    static String[] options = { "Add Word", "Delete Word", "Translate", "Exit" };
    HashMap<String, Dictionary> dictionaries;
    
    public ManagerMenu() {
        super("===== DICTIONARY PROGRAM =====", options);
        dictionaryRepository = new DictionaryRepository();
        dictionaries = new HashMap<>();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                dictionaryRepository.addWord(dictionaries);
                break;
            case 2:
                dictionaryRepository.removeWord(dictionaries);
                break;
            case 3:
                dictionaryRepository.translate(dictionaries);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}