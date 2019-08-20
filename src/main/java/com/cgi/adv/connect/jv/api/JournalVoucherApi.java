package com.cgi.adv.connect.jv.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.cgi.adv.connect.jv.model.JVrequestWrapper;
import com.cgi.adv.connect.jv.model.JVresponseWrapper;
import com.cgi.adv.connect.jv.model.ModelApiResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.jaxrs.PATCH;

/**
 * AC-FIN-JV_RequestResponse
 *
 * <p>This is Advantage FIN Transaction Journal Voucher Web Service. Currently it has GET, POST & PATCH method to allow export,import,submit,validate,discard a transaction respectively.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface JournalVoucherApi  {

    /**
     * Import a JV transaction into Advantage
     *
     * The jv/transaction/import endpoint adds a Journal Voucher to Advantage. Imported transaction can be validated and submitted automatically. Transaction failing to validate can be automatically discarded or retained as drafts on the Advantage transaction catalog. 
     *
     */
    @POST
    @Path("/jv")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Import a JV transaction into Advantage", tags={ "Journal Voucher",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Standard Response - Success - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 202, message = "Standard Response - Async Pattern - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ModelApiResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ModelApiResponse.class),
        @ApiResponse(code = 504, message = "Gateway Timeout", response = ModelApiResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ModelApiResponse.class) })
    public ModelApiResponse callImport(@Valid JVrequestWrapper jvrequestWrapper);

    /**
     * Discards selected Transaction
     *
     * The jv/transaction/discard endpoint discards the specified transaction. 
     *
     */
    @PATCH
    @Path("/jv/trancode/{tran-code}/dept/{dept-id}/tranid/{tran-id}/discard")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Discards selected Transaction", tags={ "Journal Voucher",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Standard Response - Success - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 202, message = "Standard Response - Async Pattern - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ModelApiResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ModelApiResponse.class),
        @ApiResponse(code = 504, message = "Gateway Timeout", response = ModelApiResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ModelApiResponse.class) })
    public ModelApiResponse discard(@PathParam("tran-code") String tranCode, @PathParam("dept-id") String deptId, @PathParam("tran-id") String tranId, @Valid JVrequestWrapper jvrequestWrapper);

    /**
     * Export copies of selected transaction
     *
     * The jv/transaction/export endpoint exports a copy of Journal Voucher from Advantage. 
     *
     */
    @GET
    @Path("/jv/trancode/{tran-code}/dept/{dept-id}/tranid/{tran-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Export copies of selected transaction", tags={ "Journal Voucher",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Standard Response - Success - A single transaction", response = JVresponseWrapper.class),
        @ApiResponse(code = 204, message = "No Data Found", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ModelApiResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ModelApiResponse.class),
        @ApiResponse(code = 504, message = "Gateway Timeout", response = ModelApiResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ModelApiResponse.class) })
    public JVresponseWrapper export(@PathParam("tran-code") String tranCode, @PathParam("dept-id") String deptId, @PathParam("tran-id") String tranId, @QueryParam("includelinegroup") String includelinegroup, @QueryParam("includelinegroupaccounting") String includelinegroupaccounting, @QueryParam("includelinegroupaccountingposting") String includelinegroupaccountingposting);

    /**
     * Submit a transaction into Advantage
     *
     * The jv/transaction/submit endpoint submits the specified transaction. 
     *
     */
    @PATCH
    @Path("/jv/trancode/{tran-code}/dept/{dept-id}/tranid/{tran-id}/submit")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Submit a transaction into Advantage", tags={ "Journal Voucher",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Standard Response - Success - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 202, message = "Standard Response - Async Pattern - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ModelApiResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ModelApiResponse.class),
        @ApiResponse(code = 504, message = "Gateway Timeout", response = ModelApiResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ModelApiResponse.class) })
    public ModelApiResponse submit(@PathParam("tran-code") String tranCode, @PathParam("dept-id") String deptId, @PathParam("tran-id") String tranId, @Valid JVrequestWrapper jvrequestWrapper);

    /**
     * Validate selected Transaction
     *
     * The jv/transaction/validate endpoint validates the specified transaction. 
     *
     */
    @PATCH
    @Path("/jv/trancode/{tran-code}/dept/{dept-id}/tranid/{tran-id}/validate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Validate selected Transaction", tags={ "Journal Voucher" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Standard Response - Success - A single transaction", response = ModelApiResponse.class),
        @ApiResponse(code = 202, message = "Standard Response - Async Pattern - A single transactions", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ModelApiResponse.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ModelApiResponse.class),
        @ApiResponse(code = 504, message = "Gateway Timeout", response = ModelApiResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ModelApiResponse.class) })
    public ModelApiResponse validate(@PathParam("tran-code") String tranCode, @PathParam("dept-id") String deptId, @PathParam("tran-id") String tranId, @Valid JVrequestWrapper jvrequestWrapper);
}

