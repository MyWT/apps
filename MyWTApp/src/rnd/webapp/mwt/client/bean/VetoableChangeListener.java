package rnd.webapp.mwt.client.bean;

public interface VetoableChangeListener {

	void vetoableChanged(ValueChangeEvent vce) throws ValueVetoException;

	void indexedVetoableChanged(IndexedValueChangedEvent ivce) throws ValueVetoException;

}
