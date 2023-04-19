/**
 * @author RYX
 */
public class QQ {
	private int id;
	private int qqid;
	private int num;
	private String name;
	private String icon;
	private String password;

	public QQ() {
	}

	public QQ(int id, int qqid, int num, String name, String icon, String password) {
		this.id = id;
		this.qqid = qqid;
		this.num = num;
		this.name = name;
		this.icon = icon;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQqid() {
		return qqid;
	}

	public void setQqid(int qqid) {
		this.qqid = qqid;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
