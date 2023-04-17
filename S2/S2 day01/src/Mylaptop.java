/**
 * @author RYX
 */
public class Mylaptop {
	String id;
	String name;
	String cup;
	String gpu;
	String ramsize;
	String storagesize;

	public Mylaptop() {
	}

	public Mylaptop(String id, String name, String cup, String gpu, String ramsize, String storagesize) {
		this.id = id;
		this.name = name;
		this.cup = cup;
		this.gpu = gpu;
		this.ramsize = ramsize;
		this.storagesize = storagesize;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	public String getStoragesize() {
		return storagesize;
	}

	public void setStoragesize(String storagesize) {
		this.storagesize = storagesize;
	}
}
