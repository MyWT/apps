package rnd.webapp.mwt.client.bean.action;

import rnd.webapp.mwt.client.bean.IndexedValueChangedEvent;

public class IndexedValueActionEvent extends ValueActionEvent {

	public IndexedValueActionEvent(Object source, IndexedValueChangedEvent indexedValueChangedEvent, int changeLevel, Object[] chainObjects) {
		super(source, indexedValueChangedEvent, changeLevel, chainObjects);
	}

	public IndexedValueChangedEvent getIndexedValueChangeEvent() {
		return (IndexedValueChangedEvent) super.getValueChangeEvent();
	}

}
