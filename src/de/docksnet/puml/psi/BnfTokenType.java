/*
 * Copyright 2011-2011 Gregory Shrago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.docksnet.puml.psi;

import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.language.PumlLanguage;

public class BnfTokenType extends IElementType {
    private int line;
    private int column;

    public BnfTokenType(String debug) {
        super(debug, PumlLanguage.PUML_LANGUAGE);
    }

    public BnfTokenType(int line, int column, String debug) {
        this(debug);
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
