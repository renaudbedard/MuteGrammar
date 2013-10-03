
public interface MutableAccess {
	public Object get();
	public Statement getHostStatement();
	public void set(Object newValue);
	public boolean exists();
}
