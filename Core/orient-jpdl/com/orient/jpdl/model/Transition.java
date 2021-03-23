/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.orient.jpdl.model;

/**
 * Class Transition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Transition extends com.orient.jpdl.model.TransitionType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conditionList.
     */
    private java.util.List<com.orient.jpdl.model.Condition> _conditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Transition() {
        super();
        this._conditionList = new java.util.ArrayList<com.orient.jpdl.model.Condition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCondition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCondition(
            final com.orient.jpdl.model.Condition vCondition)
    throws java.lang.IndexOutOfBoundsException {
        this._conditionList.add(vCondition);
    }

    /**
     * 
     * 
     * @param index
     * @param vCondition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCondition(
            final int index,
            final com.orient.jpdl.model.Condition vCondition)
    throws java.lang.IndexOutOfBoundsException {
        this._conditionList.add(index, vCondition);
    }

    /**
     * Method enumerateCondition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends com.orient.jpdl.model.Condition> enumerateCondition(
    ) {
        return java.util.Collections.enumeration(this._conditionList);
    }

    /**
     * Method getCondition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the com.orient.jpdl.model.Condition at
     * the given index
     */
    public com.orient.jpdl.model.Condition getCondition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conditionList.size()) {
            throw new IndexOutOfBoundsException("getCondition: Index value '" + index + "' not in range [0.." + (this._conditionList.size() - 1) + "]");
        }

        return (com.orient.jpdl.model.Condition) _conditionList.get(index);
    }

    /**
     * Method getCondition.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.orient.jpdl.model.Condition[] getCondition(
    ) {
        com.orient.jpdl.model.Condition[] array = new com.orient.jpdl.model.Condition[0];
        return (com.orient.jpdl.model.Condition[]) this._conditionList.toArray(array);
    }

    /**
     * Method getConditionCount.
     * 
     * @return the size of this collection
     */
    public int getConditionCount(
    ) {
        return this._conditionList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateCondition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends com.orient.jpdl.model.Condition> iterateCondition(
    ) {
        return this._conditionList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllCondition(
    ) {
        this._conditionList.clear();
    }

    /**
     * Method removeCondition.
     * 
     * @param vCondition
     * @return true if the object was removed from the collection.
     */
    public boolean removeCondition(
            final com.orient.jpdl.model.Condition vCondition) {
        boolean removed = _conditionList.remove(vCondition);
        return removed;
    }

    /**
     * Method removeConditionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.orient.jpdl.model.Condition removeConditionAt(
            final int index) {
        java.lang.Object obj = this._conditionList.remove(index);
        return (com.orient.jpdl.model.Condition) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCondition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCondition(
            final int index,
            final com.orient.jpdl.model.Condition vCondition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conditionList.size()) {
            throw new IndexOutOfBoundsException("setCondition: Index value '" + index + "' not in range [0.." + (this._conditionList.size() - 1) + "]");
        }

        this._conditionList.set(index, vCondition);
    }

    /**
     * 
     * 
     * @param vConditionArray
     */
    public void setCondition(
            final com.orient.jpdl.model.Condition[] vConditionArray) {
        //-- copy array
        _conditionList.clear();

        for (int i = 0; i < vConditionArray.length; i++) {
                this._conditionList.add(vConditionArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.orient.jpdl.model.Transition
     */
    public static com.orient.jpdl.model.Transition unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.orient.jpdl.model.Transition) org.exolab.castor.xml.Unmarshaller.unmarshal(com.orient.jpdl.model.Transition.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
