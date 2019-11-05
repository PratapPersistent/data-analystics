<!doctype html>
<html lang="en">
<head>

<%@ include file="./globalDetails.jsp"%>
<title>Insert title here</title>


</head>
<body style="align-items: center;">

	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p align="center">
	<h3>
		<a href="/">Home</a>
	</h3>
	<div align="center" style="width: 40%">

		<table class="table table-striped table-bordered table-sm"
			style="align-self: center; align-content: center; align-items: center;">
			<thead>
				<tr>
					<th class="th-sm" colspan="2">Public Data</th>
				</tr>

			</thead>

			<tbody>
				
				<tr>
				<th class="th-sm" colspan="2">Ward  Details</th>
				</tr>

				<tr>
					<td>Ward Name</td>
					<td>${publicDetails.wardId.wardName}</td>
				</tr>

				<tr>
					<td>Ward Number</td>
					<td>${publicDetails.wardId.wardNumber}</td>
				</tr>

				<tr>
					<td>Public Id</td>
					<td>${publicDetails.pdId}</td>
				</tr>

				<tr>
					<td>First Name</td>
					<td>${publicDetails.fname}</td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td>${publicDetails.mname}</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>${publicDetails.lname}</td>
				</tr>
				<tr>

					<td>Mobile Number</td>
					<td>${publicDetails.mobileNum}</td>
				</tr>
				<tr>
					<td>Whatsapp Number</td>
					<td>${publicDetails.whatsAppNum}</td>
				</tr>

				<tr>
					<th class="th-sm" colspan="2">Permanent Address</th>
				</tr>
				
					<tr>
					<td>Address Line 1</td>
					<td>${publicDetails.pAddress.addressLine1}</td>
				</tr>
					<tr>
					<td>Address Line 2</td>
					<td>${publicDetails.pAddress.addressLine2}</td>
				</tr>
					<tr>
					<td>Address Line 3</td>
					<td>${publicDetails.pAddress.addressLine3}</td>
				</tr>
					<tr>
					<td>City</td>
					<td>${publicDetails.pAddress.city}</td>
				</tr>
					<tr>
					<td>PinCode</td>
					<td>${publicDetails.pAddress.pinCode}</td>
				</tr>
				
						<tr>
					<th class="th-sm" colspan="2">Temporary Address</th>
				</tr>
				
					<tr>
					<td>Address Line 1</td>
					<td>${publicDetails.tAddress.addressLine1}</td>
				</tr>
					<tr>
					<td>Address Line 2</td>
					<td>${publicDetails.tAddress.addressLine2}</td>
				</tr>
					<tr>
					<td>Address Line 3</td>
					<td>${publicDetails.tAddress.addressLine3}</td>
				</tr>
					<tr>
					<td>City</td>
					<td>${publicDetails.tAddress.city}</td>
				</tr>
					<tr>
					<td>PinCode</td>
					<td>${publicDetails.tAddress.pinCode}</td>
				</tr>
				
					<tr>
					<th class="th-sm" colspan="2">Documents Details</th>
				</tr>
				
					<tr>
					<td>Aadhar card</td>
					<td>${publicDetails.docId.aadharCard}</td>
				</tr>
					<tr>
					<td>Pan Card</td>
					<td>${publicDetails.docId.panCard}</td>
				</tr>
					<tr>
					<td>Passport</td>
					<td>${publicDetails.docId.passport}</td>
				</tr>
					<tr>
					<td>Senior Citizen Pass</td>
					<td>${publicDetails.docId.ssPass}</td>
				</tr>
					<tr>
					<td>Voting Card</td>
					<td>${publicDetails.docId.votingCard}</td>
				</tr><tr>
					<td>Ration Card</td>
					<td>${publicDetails.docId.rationCard}</td>
				</tr>
				
				
			</tbody>

		</table>

	<p>&nbsp;</p>
	<p>&nbsp;</p>
	</div>
</body>
</html>