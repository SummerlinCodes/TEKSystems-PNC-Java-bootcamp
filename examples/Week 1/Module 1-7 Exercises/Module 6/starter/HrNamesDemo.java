import java.util.List;

public class HrNamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // TODO: filter HR → map name → sorted → toList
        List<String> hrNames = employees.stream()
                // TODO: .filter(...) (In Prog.)
                .filter(e -> e.getDept().equals("HR").map(Employee::getName)
                                .sorted().collect(Collectors.toList());  // [Alice,Charlie]
                // TODO: .map(...)
                // TODO: .sorted()
                // TODO: .toList()
                ;

        System.out.println("HR names:");
        hrNames.forEach(System.out::println);
    }
}
