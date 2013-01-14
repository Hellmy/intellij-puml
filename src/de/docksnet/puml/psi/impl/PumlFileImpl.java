/*
 * Copyright 2011-12 Aman Kumar
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
package de.docksnet.puml.psi.impl;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.CachedValue;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.util.Processor;
import de.docksnet.puml.language.PumlFileType;
import de.docksnet.puml.parser.GeneratedParserUtilBase;
import de.docksnet.puml.psi.BnfFileBody;
import de.docksnet.puml.psi.BnfUmlBody;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PumlFileImpl extends PsiFileBase {

    private final CachedValue<List<BnfUmlBody>> myBodies;

    public PumlFileImpl(FileViewProvider fileViewProvider) {
        super(fileViewProvider, PumlFileType.PUML_FILE_TYPE.getLanguage());

        myBodies = CachedValuesManager.getManager(getProject()).createCachedValue(new CachedValueProvider<List<BnfUmlBody>>() {
            @Override
            public Result<List<BnfUmlBody>> compute() {
                return Result.create(calcAttributes(), PumlFileImpl.this);
            }
        }, false);
    }

    public List<BnfUmlBody> getUmlBodies() {
        return myBodies.getValue();
    }

    private List<BnfUmlBody> calcAttributes() {
        final List<BnfUmlBody> result = new ArrayList<BnfUmlBody>();
        processChildrenDummyAware(this, new Processor<PsiElement>() {
            @Override
            public boolean process(PsiElement psiElement) {
                if (psiElement instanceof BnfUmlBody) result.add((BnfUmlBody) psiElement);
                return true;
            }
        });
        return result;
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PumlFileType.PUML_FILE_TYPE;
    }



    public static boolean processChildrenDummyAware(PsiElement element, final Processor<PsiElement> processor) {
        return new Processor<PsiElement>() {
            @Override
            public boolean process(PsiElement psiElement) {
                for (PsiElement child = psiElement.getFirstChild(); child != null; child = child.getNextSibling()) {
                    if (child instanceof GeneratedParserUtilBase.DummyBlock) {
                        if (!process(child)) return false;
                    }
                    else if (!processor.process(child)) return false;
                }
                return true;
            }
        }.process(element);
    }
}
