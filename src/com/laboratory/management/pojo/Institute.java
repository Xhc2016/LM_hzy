package com.laboratory.management.pojo;

public class Institute {
	
    private String instituteName;
	
	private String instituteId;

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	@Override
	public String toString() {
		return "Institute [instituteName=" + instituteName + ", instituteId=" + instituteId + "]";
	}

	
}
