package DayFifteen.generics;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
