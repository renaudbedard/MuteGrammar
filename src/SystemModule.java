

public class SystemModule implements Module {
	
	boolean log;
	boolean memory;

	@Override
	public void evaluate(Statement statement) {
	}

	@Override
	public void close() {
		
//		System.out.println("\n## MEMORY DUMP FOLLOWS ##\n");
//		
//		Statement[] ss = new Statement[visitor.namedStatements.size()];
//		visitor.namedStatements.values().toArray(ss);
//		Arrays.sort(ss);
//		for (Statement s : ss)
//			System.out.println(s.toString());
	}

}
