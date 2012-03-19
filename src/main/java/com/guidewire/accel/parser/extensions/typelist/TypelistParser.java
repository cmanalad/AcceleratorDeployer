package com.guidewire.accel.parser.extensions.typelist;

import com.guidewire.accel.parser.extensions.typelist.model.TypelistModel;
import com.guidewire.typelists.TypelistDocument;

import java.io.File;

/**
 *
 * User: tp23161
 * Date: 13/03/12
 * Time: 11:59
 *
 */
public class TypelistParser {

  public static TypelistModel parse(File entityExtension) {
    try {
      TypelistDocument tDoc = TypelistDocument.Factory.parse(entityExtension);
      TypelistDocument.Typelist typeList = tDoc.getTypelist();

    }
    catch(Throwable t) {  
    }
    return null;
  }
}
