public class Demo{

  public static void removeDuplicates(SuperArray s){
    for (int i=0; i<s.size();){
      if (s.indexOf(s.get(i)) == i) i++;
      else s.remove(i);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray(a.size());
    for (int i=0; i<a.size(); i++){
      if (b.indexOf(a.get(i)) != -1) overlap.add(a.get(i));
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro"); 

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray array1 = new SuperArray(4);
    array1.add("1");
    array1.add("2");
    array1.add("3");
    array1.add("4");

    SuperArray array2 = new SuperArray(3);
    array2.add("6");
    array2.add("4");
    array2.add("2");

    System.out.println(findOverlap(array1, array2));
  }

}
