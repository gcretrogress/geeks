package base.data;

public class Data {

	private int    dataId;
	private String dataName;
	private String type;
	
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "dataId = " + dataId + ", dataName = " + dataName + ", type = " + type;
	}
	
}
