package com.zerobase.api.loan.request

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/fintech/api/v1")
class LoanRequestController (
        private val loanRequestServiceImpl: LoanRequestServiceImpl
){

    @PostMapping("/request")
    fun loanRequest(
            @RequestBody loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): ResponseEntity<LoanRequestDto.LoanRequestResponseDto> {
        return ResponseEntity.ok(
                loanRequestServiceImpl.loanRequestMain(loanRequestInputDto)
        )
    }

}