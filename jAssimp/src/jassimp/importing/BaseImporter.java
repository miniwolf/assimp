/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassimp.importing;

import jassimp.components.AiScene;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author gbarbieri
 */
public class BaseImporter {

    public AiScene readFile(File file) throws IOException {

        return internalRead(file);
    }

    protected AiScene internalRead(File file) throws IOException {
        
        return null;
    }
}