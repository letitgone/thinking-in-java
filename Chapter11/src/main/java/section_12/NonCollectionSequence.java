package section_12;

import typeinfo.pets.*;

import java.util.Iterator;

/**
 * @Author ZhangGJ
 * @Date 2019/05/30
 */
class PetSequence {
		protected Pet[] pets = Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence {
		public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
						private int index = 0;
						public boolean hasNext() {
								return index < pets.length;
						}
						public Pet next() { return pets[index++]; }
						public void remove() { // Not implemented
								throw new UnsupportedOperationException();
						}
				}; }
		public static void main(String[] args) {
				NonCollectionSequence nc = new NonCollectionSequence();
				InterfaceVsIterator.display(nc.iterator());
		}
}
