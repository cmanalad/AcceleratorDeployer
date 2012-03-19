package com.guidewire.accel.parser.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * User: tp23161
 * Date: 14/03/12
 * Time: 13:16
 *
 */
public abstract class Model implements Serializable {

  ArrayList<Field> changedFields = new ArrayList<Field>();
  ArrayList<Field> addedFields = new ArrayList<Field>();
  ArrayList<Field> removedFields = new ArrayList<Field>();

  public abstract void compareWithModel(Model otherModel);
  
  public Field[] getChangedFields() {
    return changedFields.toArray(new Field[changedFields.size()]);
  }
  
  public Field[] getAddedFields() {
    return addedFields.toArray(new Field[addedFields.size()]);
  }

  public Field[] getRemovedFields() {
    return removedFields.toArray(new Field[removedFields.size()]);
  }
}
