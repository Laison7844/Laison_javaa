package com.gradedprojectq12;

import java.io.Serializable;

public class Project implements Serializable {
	String projectCode;
	String projectName;
	int projectStrength;

	Project(String projectCode, String projectName, int projectStrength) {
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
}
