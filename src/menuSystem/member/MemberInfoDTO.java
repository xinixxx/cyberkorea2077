package menuSystem.member;

public class MemberInfoDTO {
		// 1. 필드 (컬럼들)
		private String id;
		private String pw;
		private String name;
		
		
		// 2. 메소드
		
		public MemberInfoDTO() {
		}
		public MemberInfoDTO(String id, String pw, String name) {
			this.id = id;
			this.pw = pw;
			this.name = name;
		}
		
		// getter, setter 메소드
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
