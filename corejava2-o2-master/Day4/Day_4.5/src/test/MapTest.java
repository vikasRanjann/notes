package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	private Map<Account, Customer> map;
	public void setMap(Map<Account, Customer> map) {
		this.map = map;
	}
	public void addRecord(Account[] keys, Customer[] values) {
		if( this.map != null ){
			if( keys != null && values != null ) {
				for( int index = 0; index < keys.length; ++ index )
					this.map.put(keys[ index ], values[ index ] );
			}
		}
	}
	public Customer findRecord(int number) {
		if( this.map != null ) {
			Account key = new Account(number);
			if( this.map.containsKey(key))
				return this.map.get(key);
		}
		return null;
	}
	public boolean removeRecord(int number) {
		if( this.map != null ) {
			Account key = new Account(number);
			if( this.map.containsKey(key)){
				this.map.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printRecord() {
		if( this.map != null ) {
			Set<Entry<Account, Customer>> entries = this.map.entrySet();
			for (Entry<Account, Customer> entry : entries) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}
