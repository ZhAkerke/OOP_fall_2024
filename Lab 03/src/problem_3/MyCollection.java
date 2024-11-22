package problem_3;

interface MyCollection<T> {
   void add(T element);
   void remove(T element);
   int size();
   boolean contains(T element);

   void clearAll();
   boolean isEmpty();
}