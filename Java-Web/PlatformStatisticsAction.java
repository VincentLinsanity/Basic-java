/*
後端執行搜索的類別，這邊省略掉許多條件與搜尋過程
搭配Class CheckBox與前端頁面PlatformStatisticsAction.xhtml
注意@Name為jboss所提供的Annotation，提供class在xhtml中可辨識的名稱
@Scope一般可選EVENT(依單一事件)或SESSION(單一次查詢)作為資料保留的生命周期
*/

@Name("PlatformStatisticsAction")
@Scope(ScopeType.EVENT)
public class PlatformStatisticsAction extends CheckBox
{
	@In
	private FacesMessages facesMessages; // 提供顯示頁面資訊的物件

	public String initPage()
	{
		return "/platformStatistics.xhtml";
	}

	public void applyStatistic()
	{
		if (no error)
		{
			execution(); // 依照條件執行搜索
		}
		else
		{
			facesMessages.add("#{messages['java.facesMessages.time.ensureTimeRangeRight']}"); // 回傳錯誤資訊
			return;
		}
	}
}
