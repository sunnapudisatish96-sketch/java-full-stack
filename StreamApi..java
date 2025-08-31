package pujithait;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {
 public static void main (String[] args)
 {
// Arrays.stream(new int[] {2,4,6,8,10})
// .map((x) -> x*x)

// .average()
// .ifPresent(n -> System.out.print(n));

// System.out.println();

// }

//}
//Arrays.stream(new int[]{6,8,10,12,14})
//.map(y->y*y)
//.average()
//.ifPresent(n->System.out.print(n));

//System.out.println();
//}
//}
	 //String[] names= {"Satish","Pujitha","Rajesh","Pradeep","Anu","Akshya"};
	//Arrays.stream(names)
	 //.filter((x) -> x.startsWith("A"))
	 //.sorted()
	 //.forEach(x->System.out.println(x+","));
	// }
//}
	 Stream.of("Hi","Hello","India")
	 .sorted()
	 .findFirst()
	 .ifPresent(x -> System.out.println(x));
 }
}