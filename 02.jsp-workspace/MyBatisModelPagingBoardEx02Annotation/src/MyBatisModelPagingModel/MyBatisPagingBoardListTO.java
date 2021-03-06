package MyBatisModelPagingModel;

import java.util.ArrayList;

// 이곳에는 페이징에 관련된 정보들과, 목록창에서 보이는 글들이 저장된다.
public class MyBatisPagingBoardListTO {
	// 현재페이지
	private int cpage;
	// 한페이지에 보일 글 수
	private int recordPerPage;
	// 한 페이지에 보일 페이지 이동 번호 수
	private int blockPerPage;
	// 총 페이지 수
	private int totalPage;
	// 전체 글 수
	private int totalRecord;
	// 현재 보이는 페이지 이동 번호의 시작번호
	private int startBlock;
	// 현재 보이는 페이지 이동 번호의 끝번호
	private int endBlock;
	// 현재 페이지에서 보이는 글의 시작번호
	private int fromIndex;
	
	// DB에서 읽어온 목록을 저장하는곳
	private ArrayList<MyBatisPagingBoardTO> boardLists;

	// 생성자를 이용하여 초기값을 설정해놓음
	public MyBatisPagingBoardListTO() {
		// 페이지 시작되면 제일처음 1페이지니까 현재페이지는 1
		this.cpage = 1;
		// 한페이지에 보이는 글은 10개
		this.recordPerPage = 10;
		// 페이지 넘기는 부분에는 최대 5개의 숫자를 선택할수있다
		this.blockPerPage = 5;
		// DB에서 아직 읽어오기 전이니까 총 페이지 수는 1개
		this.totalPage = 1;
		// DB에서 아직 읽어오기 전이니까 총 글 수는 0개
		this.totalRecord = 0;
	}

	public int getFromIndex() {
		return fromIndex;
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = fromIndex;
	}

	public int getCpage() {
		return cpage;
	}

	public void setCpage(int cpage) {
		this.cpage = cpage;
	}

	public int getRecordPerPage() {
		return recordPerPage;
	}

	public void setRecordPerPage(int recordPerPage) {
		this.recordPerPage = recordPerPage;
	}

	public int getBlockPerPage() {
		return blockPerPage;
	}

	public void setBlockPerPage(int blockPerPage) {
		this.blockPerPage = blockPerPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getStartBlock() {
		return startBlock;
	}

	public void setStartBlock(int startBlock) {
		this.startBlock = startBlock;
	}

	public int getEndBlock() {
		return endBlock;
	}

	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}

	public ArrayList<MyBatisPagingBoardTO> getBoardLists() {
		return boardLists;
	}

	public void setBoardLists(ArrayList<MyBatisPagingBoardTO> boardLists) {
		this.boardLists = boardLists;
	}
	
	
}
