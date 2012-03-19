package com.guidewire.accel.parser.extensions.entity;

import com.guidewire.accel.parser.extensions.entity.model.EntityModel;
import com.guidewire.datamodel.ColumnDocument;
import com.guidewire.datamodel.EntityDocument;

import java.io.File;

/**
 *
 * User: tp23161
 * Date: 13/03/12
 * Time: 11:59
 *
 */
public class EntityParser {

  public static EntityModel parse(File entityExtension) {
    try {
      EntityDocument eDoc = EntityDocument.Factory.parse(entityExtension);
      EntityDocument.Entity ent = eDoc.getEntity();
      ColumnDocument.Column[] columns = ent.getColumnArray();
      for(ColumnDocument.Column c : columns) {

      }
    }
    catch (Throwable t) {
    }
    return null;
  }
}
