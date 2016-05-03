/*
伺服器選單是一個常用的資訊故獨立出來提供繼承使用
*/

public class CheckBox
{
	public static ArrayList<String> serverList; // 提供選擇的列表

	public static HashMap<String, Boolean> checked; // 選擇後的條件存到這個Map中
	
	static
	{
		serverList = new ArrayList<String>();
		checked =   new HashMap<String, Boolean>();

    // 建立選單內容的過程，依需求撰寫
		for (Integer index : SystemConstant.SERVER_NAME_MAP.keySet())
		{
			String name = SystemConstant.SERVER_NAME_MAP.get(index);
			serverList.add(index.toString()+"=" + name);
		}
		
		Collections.sort(serverList); 
	}

	public ArrayList<String> getServerList()
	{
		return serverList;
	}

	public void setServerList(ArrayList<String> serverList)
	{
		CheckBox.serverList = serverList;
	}

	public HashMap<String, Boolean> getChecked()
	{
		return checked;
	}

	public void setChecked(HashMap<String, Boolean> checked)
	{
		CheckBox.checked = checked;
	}
	
}
