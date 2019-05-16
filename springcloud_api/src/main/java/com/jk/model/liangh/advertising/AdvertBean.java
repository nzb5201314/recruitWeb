/**
 * Copyright (C), 2019, 金科
 * FileName: AdvertBean
 * Author:   Administrator
 * Date:     2019/5/16 14:16
 * History:
 */
package com.jk.model.liangh.advertising;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈广告表〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
public class AdvertBean implements Serializable {


	private static final long serialVersionUID = 5477977034934141164L;


	private Integer id;
	private String theme;
	private String alias;
	private Integer is_display;
	private Integer category_id;
	private String title;
	private String note;
	private Integer show_order;
	private Integer deadline;
	private Integer starttime;
	private Integer addtime;
	private String content;
	private String url;
	private String text_color;
	private String explain;
	private Integer uid;
    private String categoryname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getIs_display() {
		return is_display;
	}

	public void setIs_display(Integer is_display) {
		this.is_display = is_display;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getShow_order() {
		return show_order;
	}

	public void setShow_order(Integer show_order) {
		this.show_order = show_order;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public Integer getStarttime() {
		return starttime;
	}

	public void setStarttime(Integer starttime) {
		this.starttime = starttime;
	}

	public Integer getAddtime() {
		return addtime;
	}

	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText_color() {
		return text_color;
	}

	public void setText_color(String text_color) {
		this.text_color = text_color;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "AdvertBean{" +
				"id=" + id +
				", theme='" + theme + '\'' +
				", alias='" + alias + '\'' +
				", is_display=" + is_display +
				", category_id=" + category_id +
				", title='" + title + '\'' +
				", note='" + note + '\'' +
				", show_order=" + show_order +
				", deadline=" + deadline +
				", starttime=" + starttime +
				", addtime=" + addtime +
				", content='" + content + '\'' +
				", url='" + url + '\'' +
				", text_color='" + text_color + '\'' +
				", explain='" + explain + '\'' +
				", uid=" + uid +
				", categoryname='" + categoryname + '\'' +
				'}';
	}
}
