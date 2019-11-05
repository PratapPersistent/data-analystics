<!doctype html>
<html lang="en">
  <head>

<%@ include file="./globalDetails.jsp" %>
<title>Insert title here</title>

<script lang="javaScript">
$(document).ready(function () {
	$('#dtBasicExample').DataTable();
	});
</script>
</head>
<body style="align-items: center;">

<p>&nbsp;</p>
	<p>&nbsp;</p>
			
<div align="center" style="width: 80%">		

<table id="dtBasicExample" class="table table-striped table-bordered table-sm" style="align-self: center;align-content: center;align-items: center;">
  <thead>
    <tr>
    <th class="th-sm">Public Id
      </th>
      <th class="th-sm">First Name
      </th>
      <th class="th-sm">Middle Name
      </th>
      <th class="th-sm">Last Name
      </th>
      <th class="th-sm">Mobile Number
      </th>
      <th class="th-sm">Whatsapp Number
      </th>
    
    </tr>
  </thead>
  <tbody><c:forEach var="pubDetails" items="${publicDetailsList}">
  		<tr>
  			<td> ${pubDetails.pdId} </td>
  			<td> ${pubDetails.fname} </td>
  			<td> ${pubDetails.mname} </td>
  			<td> ${pubDetails.lname} </td>
  			<td><a href="<c:url value='/getPublicDetails/${pubDetails.pdId}' />"> ${pubDetails.mobileNum} </a></td>
  			<td> ${pubDetails.whatsAppNum} </td>
  		</tr> </c:forEach>
  </tbody>
  <tfoot>
    <tr>
     <th class="th-sm">Public Id
      </th>
      <th class="th-sm">First Name
      </th>
      <th class="th-sm">Middle Name
      </th>
      <th class="th-sm">Last Name
      </th>
      <th class="th-sm">Mobile Number
      </th>
      <th class="th-sm">Whatsapp Number
      </th>
    </tr>
  </tfoot>
</table>

</div>
</body>
</html>