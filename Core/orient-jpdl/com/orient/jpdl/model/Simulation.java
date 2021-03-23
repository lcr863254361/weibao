/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.orient.jpdl.model;

/**
 * create a simulation activity.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Simulation extends com.orient.jpdl.model.WireObjectType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Name of this activity. The name should be unique
     *  in the complete scope of the process.
     */
    private java.lang.String _name;

    /**
     * Graphical information used by process designer tool.
     */
    private java.lang.String _g;

    /**
     * Specifies async continuation.
     */
    private com.orient.jpdl.model.types.ContinueType _continue = com.orient.jpdl.model.types.ContinueType.fromValue("sync");

    /**
     * Field _items.
     */
    private java.util.List<com.orient.jpdl.model.SimulationItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public Simulation() {
        super();
        setContinue(com.orient.jpdl.model.types.ContinueType.fromValue("sync"));
        this._items = new java.util.ArrayList<com.orient.jpdl.model.SimulationItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSimulationItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSimulationItem(
            final com.orient.jpdl.model.SimulationItem vSimulationItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vSimulationItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vSimulationItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSimulationItem(
            final int index,
            final com.orient.jpdl.model.SimulationItem vSimulationItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vSimulationItem);
    }

    /**
     * Method enumerateSimulationItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends com.orient.jpdl.model.SimulationItem> enumerateSimulationItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Returns the value of field 'continue'. The field 'continue'
     * has the following description: Specifies async continuation.
     * 
     * @return the value of field 'Continue'.
     */
    public com.orient.jpdl.model.types.ContinueType getContinue(
    ) {
        return this._continue;
    }

    /**
     * Returns the value of field 'g'. The field 'g' has the
     * following description: Graphical information used by process
     * designer tool.
     * 
     * @return the value of field 'G'.
     */
    public java.lang.String getG(
    ) {
        return this._g;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Name of this activity. The name
     * should be unique
     *  in the complete scope of the process.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getSimulationItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.orient.jpdl.model.SimulationItem at the given index
     */
    public com.orient.jpdl.model.SimulationItem getSimulationItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getSimulationItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (com.orient.jpdl.model.SimulationItem) _items.get(index);
    }

    /**
     * Method getSimulationItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.orient.jpdl.model.SimulationItem[] getSimulationItem(
    ) {
        com.orient.jpdl.model.SimulationItem[] array = new com.orient.jpdl.model.SimulationItem[0];
        return (com.orient.jpdl.model.SimulationItem[]) this._items.toArray(array);
    }

    /**
     * Method getSimulationItemCount.
     * 
     * @return the size of this collection
     */
    public int getSimulationItemCount(
    ) {
        return this._items.size();
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
     * Method iterateSimulationItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends com.orient.jpdl.model.SimulationItem> iterateSimulationItem(
    ) {
        return this._items.iterator();
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
    public void removeAllSimulationItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeSimulationItem.
     * 
     * @param vSimulationItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeSimulationItem(
            final com.orient.jpdl.model.SimulationItem vSimulationItem) {
        boolean removed = _items.remove(vSimulationItem);
        return removed;
    }

    /**
     * Method removeSimulationItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.orient.jpdl.model.SimulationItem removeSimulationItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (com.orient.jpdl.model.SimulationItem) obj;
    }

    /**
     * Sets the value of field 'continue'. The field 'continue' has
     * the following description: Specifies async continuation.
     * 
     * @param _continue
     * @param continue the value of field 'continue'.
     */
    public void setContinue(
            final com.orient.jpdl.model.types.ContinueType _continue) {
        this._continue = _continue;
    }

    /**
     * Sets the value of field 'g'. The field 'g' has the following
     * description: Graphical information used by process designer
     * tool.
     * 
     * @param g the value of field 'g'.
     */
    public void setG(
            final java.lang.String g) {
        this._g = g;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Name of this activity. The name
     * should be unique
     *  in the complete scope of the process.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vSimulationItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSimulationItem(
            final int index,
            final com.orient.jpdl.model.SimulationItem vSimulationItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setSimulationItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vSimulationItem);
    }

    /**
     * 
     * 
     * @param vSimulationItemArray
     */
    public void setSimulationItem(
            final com.orient.jpdl.model.SimulationItem[] vSimulationItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vSimulationItemArray.length; i++) {
                this._items.add(vSimulationItemArray[i]);
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
     * @return the unmarshaled com.orient.jpdl.model.Simulation
     */
    public static com.orient.jpdl.model.Simulation unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.orient.jpdl.model.Simulation) org.exolab.castor.xml.Unmarshaller.unmarshal(com.orient.jpdl.model.Simulation.class, reader);
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
