/* 함수명 : chkFile(파일명)
 * 설명 : 이미지 파일 여부를 확인하기 위해 확장자확인 함후. */
function chkFile(item) {
	/*
	 			배열내의 값을 찾아서 인덱스를 반환(요소가 없을 경우 -1 반환)
	  			jQuery.inArray(찾을 값, 검색 대상의 배열)
	 */
	var ext = item.val().split('.').pop().toLowerCase();
	if(jQuery.inArray(ext, ['gif','png','jpg','jpeg']) == -1){
		alert('gif, png, jpg, jpeg 파일만 업로드 할 수 있습니다.');
		return false;
	}else {
		return true;
	}
}