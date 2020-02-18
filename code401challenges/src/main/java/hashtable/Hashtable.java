package hashtable;

public class Hashtable {



   public static int tableSize = 120;
   public static Node[] hashtable = new Node[tableSize];



// Overall reference - https://www.baeldung.com/hashmap-hashtable-differences

// reference for codePointAt() method -- https://www.tutorialspoint.com/java/lang/string_codepointat.htm

        public static int hash (String key){

            int hash = 0;
            int n = key.length();

            for (int i = 0; i < n; i++) {

                hash = hash + key.codePointAt(i);

            }

            int index = hash % tableSize;

            System.out.println(index);
            return index;


        }

        public static void add( String name){
            int hashKey = hash(name);

           Node insertion = new Node(name) ;
           insertion.name = name;
           insertion.key = hashKey;

            if(hashtable[hashKey] == null){
                hashtable[hashKey] = insertion;

            }
            else if(hashtable[hashKey] != null) {

                while (hashtable[hashKey] != null) {
                 hashtable[hashKey] = hashtable[hashKey].next;
                }

              hashtable[hashKey] = insertion;
            }

        }

        public static String get(String name){
            Node iterate = new Node(name);
            int key = hash(name);
            iterate = hashtable[key];
            if (iterate.name == null){
                return null;
            }
           else if (iterate.name == name){
               return iterate.name;
           }
           else
               while(iterate.next != null && iterate.name != name) {
                   iterate = iterate.next;
               }

            return iterate.name;

        }

        public static boolean contains(String name){

            if (get(name) != null){
                return true;
            }
            else return false;

        }









    }


